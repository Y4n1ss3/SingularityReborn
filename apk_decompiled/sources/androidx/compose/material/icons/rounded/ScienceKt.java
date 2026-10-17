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
import defpackage.bv;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.Rounded rounded) {
        ImageVector imageVector = _science;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Science", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(20.54f, 17.73f, 15.0f, 11.0f, 5.0f);
        u.horizontalLineToRelative(1.0f);
        u.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        u.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        u.horizontalLineTo(8.0f);
        u.curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        u.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        bv.p(u, 1.0f, 6.0f, -5.54f, 6.73f);
        u.curveTo(3.14f, 18.12f, 3.0f, 18.56f, 3.0f, 19.0f);
        u.curveToRelative(0.01f, 1.03f, 0.82f, 2.0f, 2.0f, 2.0f);
        u.horizontalLineTo(19.0f);
        u.curveToRelative(1.19f, 0.0f, 2.0f, -0.97f, 2.0f, -2.0f);
        u.curveTo(21.0f, 18.56f, 20.86f, 18.12f, 20.54f, 17.73f);
        u.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, u.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = build;
        build.getClass();
        return build;
    }
}
