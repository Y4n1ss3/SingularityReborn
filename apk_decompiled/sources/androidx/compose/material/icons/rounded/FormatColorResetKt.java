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
public final class FormatColorResetKt {
    private static ImageVector _formatColorReset;

    public static final ImageVector getFormatColorReset(Icons.Rounded rounded) {
        ImageVector imageVector = _formatColorReset;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatColorReset", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 14.0f);
        b.curveToRelative(0.0f, -3.09f, -3.6f, -7.88f, -5.23f, -9.87f);
        b.curveToRelative(-0.4f, -0.49f, -1.15f, -0.49f, -1.55f, 0.0f);
        b.curveToRelative(-0.46f, 0.57f, -1.08f, 1.36f, -1.73f, 2.27f);
        b.lineToRelative(8.44f, 8.44f);
        b.curveToRelative(0.04f, -0.28f, 0.07f, -0.56f, 0.07f, -0.84f);
        k4.r(b, 19.29f, 19.01f, 6.12f, 5.84f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(2.61f, 2.61f);
        b.curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f);
        b.lineToRelative(1.92f, 1.92f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.41f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorReset = build;
        build.getClass();
        return build;
    }
}
