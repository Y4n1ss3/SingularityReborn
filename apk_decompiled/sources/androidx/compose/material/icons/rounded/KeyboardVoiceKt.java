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
public final class KeyboardVoiceKt {
    private static ImageVector _keyboardVoice;

    public static final ImageVector getKeyboardVoice(Icons.Rounded rounded) {
        ImageVector imageVector = _keyboardVoice;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardVoice", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 15.0f);
        b.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        b.lineTo(15.0f, 6.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveTo(9.0f, 4.34f, 9.0f, 6.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(18.08f, 12.0f);
        b.curveToRelative(-0.42f, 0.0f, -0.77f, 0.3f, -0.83f, 0.71f);
        b.curveToRelative(-0.37f, 2.61f, -2.72f, 4.39f, -5.25f, 4.39f);
        b.reflectiveCurveToRelative(-4.88f, -1.77f, -5.25f, -4.39f);
        b.curveToRelative(-0.06f, -0.41f, -0.42f, -0.71f, -0.83f, -0.71f);
        b.curveToRelative(-0.52f, 0.0f, -0.92f, 0.46f, -0.85f, 0.97f);
        b.curveToRelative(0.46f, 2.97f, 2.96f, 5.3f, 5.93f, 5.75f);
        b.lineTo(11.0f, 21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.28f);
        b.curveToRelative(2.96f, -0.43f, 5.47f, -2.78f, 5.93f, -5.75f);
        b.curveToRelative(0.07f, -0.51f, -0.33f, -0.97f, -0.85f, -0.97f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardVoice = build;
        build.getClass();
        return build;
    }
}
