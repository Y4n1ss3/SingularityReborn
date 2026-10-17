package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.c21;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewModuleKt {
    private static ImageVector _viewModule;

    public static final ImageVector getViewModule(Icons.Filled filled) {
        ImageVector imageVector = _viewModule;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ViewModule", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(14.67f, 5.0f, 6.5f, 9.33f, 5.0f);
        kp0.B(y, 14.67f, 15.67f, 11.5f, 21.0f);
        c21.c(y, 5.0f, -5.33f, 11.5f);
        uf.D(y, 14.67f, 19.0f, -6.5f, 9.33f);
        bv.z(y, 19.0f, 14.67f, 15.67f, 12.5f);
        y.verticalLineTo(19.0f);
        y.horizontalLineTo(21.0f);
        y.verticalLineToRelative(-6.5f);
        y.horizontalLineTo(15.67f);
        y.close();
        uo.p(y, 8.33f, 12.5f, 3.0f, 19.0f);
        uo.r(y, 5.33f, 12.5f, 8.33f, 11.5f);
        y.verticalLineTo(5.0f);
        y.horizontalLineTo(3.0f);
        y.verticalLineToRelative(6.5f);
        y.horizontalLineTo(8.33f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewModule = build;
        build.getClass();
        return build;
    }
}
