package com.cy.store;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class GeneratorAPP {

    public static void main(String[] args)
    {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //获得当前项目路径
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jobob");
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        gc.setEntityName("%sEntity");
        gc.setMapperName("%sMapper");
        gc.setServiceName("%sService");
        gc.setXmlName("%sMapper");
        gc.setServiceImplName("%sServiceImpl");

        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/store?");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("wmes2022");
        mpg.setDataSource(dsc);



        // 包配置
        PackageConfig pc = new PackageConfig();
      //  pc.setModuleName(scanner("模块名"));
        pc.setParent("com.cy.store");


        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
   //     strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
      //  strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 公共父类
      //  strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
        strategy.setSuperEntityColumns("id");
        strategy.setInclude("token");
       // strategy.setControllerMappingHyphenStyle(true);
       // strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
       // mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
