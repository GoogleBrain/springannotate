package cn.yufu.starter.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[]a  = {"cn.yufu.starter.domain.Man","cn.yufu.starter.domain.Woman"};

        return a;
    }
}
