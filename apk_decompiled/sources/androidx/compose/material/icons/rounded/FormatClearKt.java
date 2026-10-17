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
public final class FormatClearKt {
    private static ImageVector _formatClear;

    public static final ImageVector getFormatClear(Icons.Rounded rounded) {
        ImageVector imageVector = _formatClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 8.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(19.33f, 5.0f, 18.5f, 5.0f);
        b.lineTo(6.39f, 5.0f);
        b.lineToRelative(3.0f, 3.0f);
        b.horizontalLineToRelative(1.83f);
        b.lineToRelative(-0.55f, 1.28f);
        b.lineToRelative(2.09f, 2.09f);
        uf.j(b, 14.21f, 8.0f, 4.29f);
        b.moveTo(17.44f, 18.88f);
        b.lineTo(4.12f, 5.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(6.26f, 6.26f);
        b.lineToRelative(-1.65f, 3.84f);
        b.curveToRelative(-0.39f, 0.92f, 0.28f, 1.93f, 1.27f, 1.93f);
        b.curveToRelative(0.55f, 0.0f, 1.05f, -0.33f, 1.27f, -0.84f);
        b.lineToRelative(1.21f, -2.83f);
        b.lineToRelative(4.95f, 4.95f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.01f, -1.4f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatClear = build;
        build.getClass();
        return build;
    }
}
