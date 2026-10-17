package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(Icons.Rounded rounded) {
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Coffee", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.5f, 3.0f, 6.0f);
        d.curveTo(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f);
        d.verticalLineToRelative(5.71f);
        d.curveToRelative(0.0f, 3.83f, 2.95f, 7.18f, 6.78f, 7.29f);
        d.curveToRelative(3.96f, 0.12f, 7.22f, -3.06f, 7.22f, -7.0f);
        d.verticalLineToRelative(-1.0f);
        d.horizontalLineToRelative(0.5f);
        d.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        d.reflectiveCurveTo(20.43f, 3.0f, 18.5f, 3.0f);
        af0.A(d, 16.0f, 5.0f, 3.0f, 6.0f);
        bv.z(d, 5.0f, 16.0f, 18.5f, 8.0f);
        uf.t(d, 18.0f, 5.0f, 0.5f);
        d.curveTo(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f);
        d.reflectiveCurveTo(19.33f, 8.0f, 18.5f, 8.0f);
        af0.l(d, 5.0f, 19.0f, 14.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineTo(5.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(4.0f, 19.45f, 4.45f, 19.0f, 5.0f, 19.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffee = build;
        build.getClass();
        return build;
    }
}
