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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Rounded rounded) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OfflineBolt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.02f);
        b.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        b.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        b.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        b.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        bv.v(b, 11.48f, 17.88f, -4.14f);
        b.lineTo(8.82f, 13.74f);
        b.curveToRelative(-0.37f, 0.0f, -0.62f, -0.4f, -0.44f, -0.73f);
        b.lineToRelative(3.68f, -7.17f);
        b.curveToRelative(0.23f, -0.47f, 0.94f, -0.3f, 0.94f, 0.23f);
        b.verticalLineToRelative(4.19f);
        b.horizontalLineToRelative(2.54f);
        b.curveToRelative(0.37f, 0.0f, 0.61f, 0.39f, 0.45f, 0.72f);
        b.lineToRelative(-3.56f, 7.12f);
        b.curveToRelative(-0.24f, 0.48f, -0.95f, 0.31f, -0.95f, -0.22f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = build;
        build.getClass();
        return build;
    }
}
