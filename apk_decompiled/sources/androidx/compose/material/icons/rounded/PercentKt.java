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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(Icons.Rounded rounded) {
        ImageVector imageVector = _percent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Percent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.5f, 4.0f);
        b.curveTo(5.57f, 4.0f, 4.0f, 5.57f, 4.0f, 7.5f);
        b.reflectiveCurveTo(5.57f, 11.0f, 7.5f, 11.0f);
        b.reflectiveCurveTo(11.0f, 9.43f, 11.0f, 7.5f);
        b.reflectiveCurveTo(9.43f, 4.0f, 7.5f, 4.0f);
        b.close();
        b.moveTo(7.5f, 9.0f);
        b.curveTo(6.67f, 9.0f, 6.0f, 8.33f, 6.0f, 7.5f);
        b.reflectiveCurveTo(6.67f, 6.0f, 7.5f, 6.0f);
        b.reflectiveCurveTo(9.0f, 6.67f, 9.0f, 7.5f);
        b.reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f);
        b.close();
        b.moveTo(16.5f, 13.0f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        b.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        b.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(18.43f, 13.0f, 16.5f, 13.0f);
        b.close();
        b.moveTo(16.5f, 18.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(17.33f, 18.0f, 16.5f, 18.0f);
        b.close();
        b.moveTo(19.29f, 4.71f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(6.12f, 19.29f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.reflectiveCurveToRelative(-0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(17.88f, 4.71f);
        b.curveTo(18.27f, 4.32f, 18.9f, 4.32f, 19.29f, 4.71f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _percent = build;
        build.getClass();
        return build;
    }
}
