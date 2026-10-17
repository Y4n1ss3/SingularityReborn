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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.Rounded rounded) {
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CompassCalibration", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 17.0f, -4.0f, 0.0f);
        b.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        b.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 3.0f);
        b2.curveTo(8.49f, 3.0f, 5.28f, 4.29f, 2.8f, 6.41f);
        b2.curveToRelative(-0.44f, 0.38f, -0.48f, 1.06f, -0.06f, 1.48f);
        b2.lineToRelative(3.6f, 3.6f);
        b2.curveToRelative(0.36f, 0.36f, 0.92f, 0.39f, 1.32f, 0.08f);
        b2.curveToRelative(1.2f, -0.94f, 2.71f, -1.5f, 4.34f, -1.5f);
        b2.curveToRelative(1.64f, 0.0f, 3.14f, 0.56f, 4.34f, 1.49f);
        b2.curveToRelative(0.4f, 0.31f, 0.96f, 0.28f, 1.31f, -0.08f);
        b2.lineToRelative(3.6f, -3.6f);
        b2.curveToRelative(0.42f, -0.42f, 0.38f, -1.1f, -0.07f, -1.48f);
        b2.curveTo(18.72f, 4.28f, 15.51f, 3.0f, 12.0f, 3.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compassCalibration = build;
        build.getClass();
        return build;
    }
}
