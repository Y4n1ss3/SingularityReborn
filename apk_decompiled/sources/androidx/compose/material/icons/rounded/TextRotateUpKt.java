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
import defpackage.bv;
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRotateUpKt {
    private static ImageVector _textRotateUp;

    public static final ImageVector getTextRotateUp(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotateUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotateUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.35f, 4.35f);
        b.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        b.lineToRelative(-1.79f, 1.79f);
        b.curveToRelative(-0.31f, 0.32f, -0.09f, 0.86f, 0.36f, 0.86f);
        b.horizontalLineTo(17.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(7.0f);
        b.horizontalLineToRelative(0.79f);
        b.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        fc.B(b, -1.79f, -1.8f, 11.8f, 15.5f);
        b.verticalLineToRelative(-5.0f);
        b.lineToRelative(1.6f, -0.66f);
        b.curveToRelative(0.36f, -0.14f, 0.6f, -0.49f, 0.6f, -0.88f);
        b.curveToRelative(0.0f, -0.69f, -0.71f, -1.15f, -1.34f, -0.88f);
        b.lineToRelative(-8.97f, 3.88f);
        b.curveToRelative(-0.42f, 0.17f, -0.69f, 0.58f, -0.69f, 1.04f);
        b.curveToRelative(0.0f, 0.46f, 0.27f, 0.87f, 0.69f, 1.05f);
        b.lineToRelative(8.97f, 3.88f);
        b.curveToRelative(0.63f, 0.27f, 1.34f, -0.2f, 1.34f, -0.89f);
        b.curveToRelative(0.0f, -0.39f, -0.24f, -0.74f, -0.6f, -0.89f);
        fc.B(b, -1.6f, -0.65f, 4.98f, 13.0f);
        b.lineTo(10.0f, 11.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, 3.74f, 4.98f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotateUp = build;
        build.getClass();
        return build;
    }
}
