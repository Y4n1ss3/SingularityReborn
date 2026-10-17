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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalFloristKt {
    private static ImageVector _localFlorist;

    public static final ImageVector getLocalFlorist(Icons.Filled filled) {
        ImageVector imageVector = _localFlorist;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocalFlorist", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 22.0f);
        b.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.close();
        b.moveTo(5.6f, 10.25f);
        b.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        b.curveToRelative(0.53f, 0.0f, 1.01f, -0.16f, 1.42f, -0.44f);
        b.lineToRelative(-0.02f, 0.19f);
        b.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        b.lineToRelative(-0.02f, -0.19f);
        b.curveToRelative(0.4f, 0.28f, 0.89f, 0.44f, 1.42f, 0.44f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.curveToRelative(0.0f, -1.0f, -0.59f, -1.85f, -1.43f, -2.25f);
        b.curveToRelative(0.84f, -0.4f, 1.43f, -1.25f, 1.43f, -2.25f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.curveToRelative(-0.53f, 0.0f, -1.01f, 0.16f, -1.42f, 0.44f);
        b.lineToRelative(0.02f, -0.19f);
        b.curveTo(14.5f, 2.12f, 13.38f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(9.5f, 2.12f, 9.5f, 3.5f);
        b.lineToRelative(0.02f, 0.19f);
        b.curveToRelative(-0.4f, -0.28f, -0.89f, -0.44f, -1.42f, -0.44f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        b.curveToRelative(0.0f, 1.0f, 0.59f, 1.85f, 1.43f, 2.25f);
        b.curveToRelative(-0.84f, 0.4f, -1.43f, 1.25f, -1.43f, 2.25f);
        b.close();
        b.moveTo(12.0f, 5.5f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        b.reflectiveCurveTo(9.5f, 9.38f, 9.5f, 8.0f);
        b.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        b.close();
        b.moveTo(3.0f, 13.0f);
        b.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFlorist = build;
        build.getClass();
        return build;
    }
}
