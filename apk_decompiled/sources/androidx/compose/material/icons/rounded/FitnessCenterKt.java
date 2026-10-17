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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FitnessCenterKt {
    private static ImageVector _fitnessCenter;

    public static final ImageVector getFitnessCenter(Icons.Rounded rounded) {
        ImageVector imageVector = _fitnessCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FitnessCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.57f, 14.86f, 0.72f, -0.72f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(-0.02f, -0.02f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineTo(17.0f, 15.57f);
        e.lineTo(8.43f, 7.0f);
        e.lineToRelative(2.86f, -2.86f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(-0.02f, -0.02f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineToRelative(-0.72f, 0.72f);
        e.lineToRelative(-0.72f, -0.72f);
        e.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        e.lineTo(5.57f, 4.14f);
        e.lineToRelative(-0.72f, -0.72f);
        e.curveToRelative(-0.39f, -0.39f, -1.04f, -0.39f, -1.43f, 0.0f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.04f, 0.0f, 1.43f);
        e.lineToRelative(0.72f, 0.72f);
        e.lineTo(2.71f, 7.0f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(0.72f, 0.72f);
        e.lineToRelative(-0.72f, 0.73f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(0.02f, 0.02f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineTo(7.0f, 8.43f);
        e.lineTo(15.57f, 17.0f);
        e.lineToRelative(-2.86f, 2.86f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(0.02f, 0.02f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(0.72f, -0.72f);
        e.lineToRelative(0.72f, 0.72f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(1.43f, -1.43f);
        e.lineToRelative(0.72f, 0.72f);
        e.curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0.0f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.04f, 0.0f, -1.43f);
        e.lineToRelative(-0.72f, -0.72f);
        e.lineTo(21.29f, 17.0f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(e, -0.72f, -0.73f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitnessCenter = build;
        build.getClass();
        return build;
    }
}
