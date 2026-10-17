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
import defpackage.fc;
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.Rounded rounded) {
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TvOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(21.0f, 8.0f, 9.88f, 1.85f, 1.85f);
        n.curveToRelative(0.1f, -0.22f, 0.15f, -0.47f, 0.15f, -0.73f);
        n.verticalLineTo(7.0f);
        n.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-7.59f);
        n.lineToRelative(2.94f, -2.94f);
        n.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        n.reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0.0f);
        n.lineTo(12.0f, 4.99f);
        n.lineTo(8.36f, 1.35f);
        n.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        n.reflectiveCurveToRelative(-0.2f, 0.51f, 0.0f, 0.71f);
        n.lineTo(10.59f, 5.0f);
        fc.z(n, 8.12f, 2.0f, 2.0f, 20.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.close();
        n.moveTo(3.12f, 2.83f);
        n.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        n.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        n.lineToRelative(0.82f, 0.82f);
        n.curveTo(1.65f, 5.28f, 1.0f, 6.06f, 1.0f, 7.0f);
        n.verticalLineToRelative(12.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(15.46f);
        n.lineToRelative(1.29f, 1.29f);
        n.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        n.curveToRelative(0.36f, -0.36f, 0.37f, -0.92f, 0.07f, -1.31f);
        gy.n(n, 0.03f, 3.12f, 2.83f);
        n.moveTo(3.0f, 18.0f);
        n.verticalLineTo(8.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        r6.t(n, 0.46f, 12.0f, 12.0f, 4.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tvOff = build;
        build.getClass();
        return build;
    }
}
