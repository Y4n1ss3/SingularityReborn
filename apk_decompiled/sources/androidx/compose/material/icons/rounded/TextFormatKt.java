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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFormatKt {
    private static ImageVector _textFormat;

    public static final ImageVector getTextFormat(Icons.Rounded rounded) {
        ImageVector imageVector = _textFormat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextFormat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(6.0f, 17.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        af0.l(b, 9.5f, 12.8f, 5.0f);
        b.lineToRelative(0.66f, 1.6f);
        b.curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f);
        b.curveToRelative(0.69f, 0.0f, 1.15f, -0.71f, 0.88f, -1.34f);
        b.lineToRelative(-3.88f, -8.97f);
        b.curveTo(12.87f, 4.27f, 12.46f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-0.46f, 0.0f, -0.87f, 0.27f, -1.05f, 0.69f);
        b.lineToRelative(-3.88f, 8.97f);
        b.curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f);
        b.curveToRelative(0.39f, 0.0f, 0.74f, -0.24f, 0.89f, -0.6f);
        fc.B(b, 0.65f, -1.6f, 12.0f, 5.98f);
        b.lineTo(13.87f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(b, -3.74f, 12.0f, 5.98f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textFormat = build;
        build.getClass();
        return build;
    }
}
