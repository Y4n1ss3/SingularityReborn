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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationAngledownKt {
    private static ImageVector _textRotationAngledown;

    public static final ImageVector getTextRotationAngledown(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationAngledown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationAngledown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(15.0f, 20.5f, -2.54f);
        h.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        h.lineToRelative(-0.56f, 0.56f);
        h.lineTo(5.1f, 9.68f);
        h.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        h.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        h.lineToRelative(8.49f, 8.49f);
        h.lineToRelative(-0.56f, 0.56f);
        h.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.34f, 0.86f);
        h.horizontalLineToRelative(2.54f);
        h.curveToRelative(0.28f, 0.0f, 0.5f, -0.23f, 0.5f, -0.5f);
        k4.x(h, 11.25f, 8.48f, 3.54f, 3.54f);
        h.lineToRelative(-0.67f, 1.6f);
        h.curveToRelative(-0.15f, 0.36f, -0.07f, 0.77f, 0.21f, 1.05f);
        h.curveToRelative(0.49f, 0.49f, 1.31f, 0.32f, 1.57f, -0.32f);
        h.lineToRelative(3.61f, -9.09f);
        h.curveToRelative(0.17f, -0.42f, 0.07f, -0.91f, -0.25f, -1.23f);
        h.curveToRelative(-0.32f, -0.32f, -0.8f, -0.42f, -1.23f, -0.25f);
        h.lineToRelative(-9.1f, 3.6f);
        h.curveToRelative(-0.64f, 0.25f, -0.81f, 1.08f, -0.32f, 1.57f);
        h.curveToRelative(0.27f, 0.27f, 0.68f, 0.35f, 1.04f, 0.2f);
        fc.B(h, 1.6f, -0.67f, 17.84f, 5.43f);
        h.lineToRelative(-2.23f, 4.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(h, -2.64f, -2.64f, 4.87f, -2.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngledown = build;
        build.getClass();
        return build;
    }
}
