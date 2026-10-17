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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SurroundSoundKt {
    private static ImageVector _surroundSound;

    public static final ImageVector getSurroundSound(Icons.Rounded rounded) {
        ImageVector imageVector = _surroundSound;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SurroundSound", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 4.0f, 4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(7.11f, 16.89f);
        i.curveToRelative(-0.43f, 0.43f, -1.14f, 0.39f, -1.51f, -0.09f);
        i.curveTo(4.53f, 15.39f, 4.0f, 13.69f, 4.0f, 12.0f);
        i.reflectiveCurveToRelative(0.53f, -3.38f, 1.59f, -4.8f);
        i.curveToRelative(0.37f, -0.48f, 1.08f, -0.53f, 1.51f, -0.1f);
        i.curveToRelative(0.35f, 0.35f, 0.39f, 0.9f, 0.1f, 1.29f);
        i.curveTo(6.4f, 9.46f, 6.0f, 10.73f, 6.0f, 12.0f);
        i.reflectiveCurveToRelative(0.4f, 2.53f, 1.2f, 3.6f);
        i.curveToRelative(0.3f, 0.39f, 0.26f, 0.94f, -0.09f, 1.29f);
        i.close();
        i.moveTo(12.0f, 16.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        i.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        i.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        i.close();
        i.moveTo(16.9f, 16.9f);
        i.curveToRelative(-0.35f, -0.35f, -0.39f, -0.9f, -0.09f, -1.29f);
        i.curveTo(17.6f, 14.54f, 18.0f, 13.27f, 18.0f, 12.0f);
        i.reflectiveCurveToRelative(-0.4f, -2.53f, -1.2f, -3.6f);
        i.curveToRelative(-0.3f, -0.39f, -0.26f, -0.95f, 0.09f, -1.3f);
        i.curveToRelative(0.43f, -0.43f, 1.14f, -0.39f, 1.51f, 0.09f);
        i.curveToRelative(1.07f, 1.41f, 1.6f, 3.1f, 1.6f, 4.8f);
        i.curveToRelative(0.0f, 1.69f, -0.53f, 3.38f, -1.59f, 4.8f);
        i.curveToRelative(-0.37f, 0.49f, -1.08f, 0.54f, -1.51f, 0.11f);
        i.close();
        i.moveTo(12.0f, 10.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _surroundSound = build;
        build.getClass();
        return build;
    }
}
