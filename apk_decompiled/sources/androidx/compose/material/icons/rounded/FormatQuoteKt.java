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
public final class FormatQuoteKt {
    private static ImageVector _formatQuote;

    public static final ImageVector getFormatQuote(Icons.Rounded rounded) {
        ImageVector imageVector = _formatQuote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatQuote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.17f, 17.0f);
        b.curveToRelative(0.51f, 0.0f, 0.98f, -0.29f, 1.2f, -0.74f);
        b.lineToRelative(1.42f, -2.84f);
        b.curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f);
        b.lineTo(10.0f, 8.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(5.0f, 7.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(-1.03f, 2.06f);
        b.curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f);
        b.close();
        b.moveTo(17.17f, 17.0f);
        b.curveToRelative(0.51f, 0.0f, 0.98f, -0.29f, 1.2f, -0.74f);
        b.lineToRelative(1.42f, -2.84f);
        b.curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f);
        b.lineTo(20.0f, 8.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(-1.03f, 2.06f);
        b.curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatQuote = build;
        build.getClass();
        return build;
    }
}
