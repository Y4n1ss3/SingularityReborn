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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.35f, 19.65f, 1.79f, -1.79f);
        e.curveToRelative(0.32f, -0.32f, 0.1f, -0.86f, -0.35f, -0.86f);
        e.lineTo(7.0f, 17.0f);
        e.lineTo(7.0f, 5.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(12.0f);
        e.horizontalLineToRelative(-0.79f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        e.lineToRelative(1.79f, 1.79f);
        e.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f);
        bv.v(e, 12.2f, 8.5f, 5.0f);
        e.lineToRelative(-1.6f, 0.66f);
        e.curveToRelative(-0.36f, 0.15f, -0.6f, 0.5f, -0.6f, 0.89f);
        e.curveToRelative(0.0f, 0.69f, 0.71f, 1.15f, 1.34f, 0.88f);
        e.lineToRelative(8.97f, -3.88f);
        e.curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.05f);
        e.curveToRelative(0.0f, -0.46f, -0.27f, -0.87f, -0.69f, -1.05f);
        e.lineToRelative(-8.97f, -3.88f);
        e.curveToRelative(-0.63f, -0.27f, -1.34f, 0.2f, -1.34f, 0.89f);
        e.curveToRelative(0.0f, 0.39f, 0.24f, 0.74f, 0.6f, 0.89f);
        fc.B(e, 1.6f, 0.65f, 19.02f, 11.0f);
        e.lineTo(14.0f, 12.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 14.0f, 9.13f, 19.02f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationDown = build;
        build.getClass();
        return build;
    }
}
