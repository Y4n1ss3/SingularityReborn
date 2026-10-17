package androidx.compose.material.icons.sharp;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlenderKt {
    private static ImageVector _blender;

    public static final ImageVector getBlender(Icons.Sharp sharp) {
        ImageVector imageVector = _blender;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Blender", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(18.0f, 3.0f, -4.0f, 2.0f, -4.0f);
        af0.B(n, 1.0f, 3.0f, 8.0f, 4.23f);
        n.lineToRelative(0.64f, 4.13f);
        af0.m(n, 6.0f, 17.0f, 5.0f, 12.0f);
        n.verticalLineToRelative(-5.0f);
        gy.B(n, -1.87f, -1.87f, 18.0f, 3.0f);
        kp0.t(n, 5.0f, 9.0f, 5.0f, 1.31f);
        gy.w(n, 0.62f, 4.0f, 5.0f);
        n.moveTo(12.0f, 19.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        n.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        n.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        n.reflectiveCurveTo(12.55f, 19.0f, 12.0f, 19.0f);
        r6.g(n, 14.29f, 14.0f, 9.72f);
        n.lineTo(8.33f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(n, 7.34f, 14.29f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blender = build;
        build.getClass();
        return build;
    }
}
