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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BreakfastDiningKt {
    private static ImageVector _breakfastDining;

    public static final ImageVector getBreakfastDining(Icons.Rounded rounded) {
        ImageVector imageVector = _breakfastDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BreakfastDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 3.0f, 6.0f);
        d.curveTo(3.79f, 3.0f, 2.0f, 4.79f, 2.0f, 7.0f);
        d.curveToRelative(0.0f, 1.48f, 0.81f, 2.75f, 2.0f, 3.45f);
        d.verticalLineTo(19.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-8.55f);
        d.curveToRelative(1.19f, -0.69f, 2.0f, -1.97f, 2.0f, -3.45f);
        d.curveTo(22.0f, 4.79f, 20.21f, 3.0f, 18.0f, 3.0f);
        k4.x(d, 15.71f, 13.7f, -3.0f, 3.0f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        d.lineToRelative(-3.0f, -3.0f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.lineToRelative(3.0f, -3.0f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(3.0f, 3.0f);
        d.curveTo(16.1f, 12.68f, 16.1f, 13.31f, 15.71f, 13.7f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _breakfastDining = build;
        build.getClass();
        return build;
    }
}
