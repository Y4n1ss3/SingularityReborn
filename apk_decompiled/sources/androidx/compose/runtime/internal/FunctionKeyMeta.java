package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@Target({ElementType.TYPE, ElementType.METHOD})
@ComposeCompilerApi
@Repeatable(Container.class)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface FunctionKeyMeta {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface Container {
        FunctionKeyMeta[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
