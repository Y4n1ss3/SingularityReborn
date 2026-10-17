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
public final class TextRotateVerticalKt {
    private static ImageVector _textRotateVertical;

    public static final ImageVector getTextRotateVertical(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotateVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotateVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 5.0f);
        b.curveToRelative(-0.46f, 0.0f, -0.87f, 0.27f, -1.05f, 0.69f);
        b.lineToRelative(-3.88f, 8.97f);
        b.curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f);
        b.curveToRelative(0.39f, 0.0f, 0.74f, -0.24f, 0.89f, -0.6f);
        b.lineToRelative(0.66f, -1.6f);
        b.horizontalLineToRelative(5.0f);
        b.lineToRelative(0.66f, 1.6f);
        b.curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f);
        b.curveToRelative(0.69f, 0.0f, 1.15f, -0.71f, 0.88f, -1.34f);
        b.lineToRelative(-3.88f, -8.97f);
        b.curveTo(15.87f, 5.27f, 15.46f, 5.0f, 15.0f, 5.0f);
        k4.r(b, 13.13f, 12.0f, 15.0f, 6.98f);
        uf.j(b, 16.87f, 12.0f, -3.74f);
        b.moveTo(6.35f, 19.64f);
        b.lineToRelative(1.79f, -1.79f);
        b.curveToRelative(0.32f, -0.31f, 0.1f, -0.85f, -0.35f, -0.85f);
        b.lineTo(7.0f, 17.0f);
        b.lineTo(7.0f, 5.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.44f, -1.0f, 1.0f);
        b.verticalLineToRelative(12.0f);
        b.horizontalLineToRelative(-0.79f);
        b.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        b.lineToRelative(1.79f, 1.79f);
        b.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotateVertical = build;
        build.getClass();
        return build;
    }
}
