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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotationNoneKt {
    private static ImageVector _textRotationNone;

    public static final ImageVector getTextRotationNone(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationNone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationNone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.65f, 17.65f, -1.79f, -1.79f);
        e.curveToRelative(-0.32f, -0.32f, -0.86f, -0.1f, -0.86f, 0.35f);
        e.verticalLineTo(17.0f);
        e.horizontalLineTo(6.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(12.0f);
        e.verticalLineToRelative(0.79f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineToRelative(1.79f, -1.79f);
        e.curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f);
        af0.l(e, 9.5f, 11.8f, 5.0f);
        e.lineToRelative(0.66f, 1.6f);
        e.curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f);
        e.curveToRelative(0.69f, 0.0f, 1.15f, -0.71f, 0.88f, -1.34f);
        e.lineToRelative(-3.88f, -8.97f);
        e.curveTo(12.87f, 3.27f, 12.46f, 3.0f, 12.0f, 3.0f);
        e.curveToRelative(-0.46f, 0.0f, -0.87f, 0.27f, -1.05f, 0.69f);
        e.lineToRelative(-3.88f, 8.97f);
        e.curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f);
        e.curveToRelative(0.39f, 0.0f, 0.74f, -0.24f, 0.89f, -0.6f);
        fc.B(e, 0.65f, -1.6f, 12.0f, 4.98f);
        e.lineTo(13.87f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(e, -3.74f, 12.0f, 4.98f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationNone = build;
        build.getClass();
        return build;
    }
}
