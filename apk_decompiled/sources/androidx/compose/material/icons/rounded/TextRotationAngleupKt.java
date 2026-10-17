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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationAngleupKt {
    private static ImageVector _textRotationAngleup;

    public static final ImageVector getTextRotationAngleup(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationAngleup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.61f, 9.85f, 0.56f, 0.56f);
        e.lineToRelative(-8.48f, 8.49f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(8.49f, -8.49f);
        e.lineToRelative(0.56f, 0.56f);
        e.curveToRelative(0.31f, 0.32f, 0.85f, 0.1f, 0.85f, -0.34f);
        e.lineTo(21.0f, 9.5f);
        e.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        e.horizontalLineToRelative(-2.54f);
        e.curveToRelative(-0.44f, 0.0f, -0.66f, 0.54f, -0.35f, 0.85f);
        k4.x(e, 8.48f, 12.75f, 3.54f, -3.54f);
        e.lineToRelative(1.6f, 0.67f);
        e.curveToRelative(0.36f, 0.15f, 0.77f, 0.07f, 1.05f, -0.21f);
        e.curveToRelative(0.49f, -0.49f, 0.32f, -1.31f, -0.32f, -1.57f);
        e.lineTo(5.26f, 4.5f);
        e.curveToRelative(-0.43f, -0.16f, -0.91f, -0.06f, -1.23f, 0.26f);
        e.curveToRelative(-0.32f, 0.32f, -0.42f, 0.8f, -0.25f, 1.23f);
        e.lineToRelative(3.61f, 9.09f);
        e.curveToRelative(0.25f, 0.64f, 1.08f, 0.81f, 1.57f, 0.32f);
        e.curveToRelative(0.28f, -0.28f, 0.36f, -0.69f, 0.21f, -1.05f);
        fc.B(e, -0.69f, -1.6f, 7.66f, 11.03f);
        e.lineTo(5.43f, 6.16f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 4.87f, 2.23f, -2.64f, 2.64f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngleup = build;
        build.getClass();
        return build;
    }
}
