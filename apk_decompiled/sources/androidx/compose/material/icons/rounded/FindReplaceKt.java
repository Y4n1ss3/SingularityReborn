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
public final class FindReplaceKt {
    private static ImageVector _findReplace;

    public static final ImageVector getFindReplace(Icons.Rounded rounded) {
        ImageVector imageVector = _findReplace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FindReplace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.0f, 6.0f);
        b.curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f);
        b.lineToRelative(-1.69f, 1.69f);
        b.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        b.horizontalLineToRelative(4.29f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.lineTo(18.0f, 5.21f);
        b.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        b.lineToRelative(-1.2f, 1.2f);
        b.curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f);
        b.curveTo(7.96f, 4.0f, 5.38f, 5.94f, 4.42f, 8.64f);
        b.curveToRelative(-0.24f, 0.66f, 0.23f, 1.36f, 0.93f, 1.36f);
        b.curveToRelative(0.42f, 0.0f, 0.79f, -0.26f, 0.93f, -0.66f);
        b.curveTo(6.96f, 7.4f, 8.82f, 6.0f, 11.0f, 6.0f);
        b.close();
        b.moveTo(16.64f, 15.14f);
        b.curveToRelative(0.4f, -0.54f, 0.72f, -1.15f, 0.95f, -1.8f);
        b.curveToRelative(0.23f, -0.65f, -0.25f, -1.34f, -0.94f, -1.34f);
        b.curveToRelative(-0.42f, 0.0f, -0.79f, 0.26f, -0.93f, 0.66f);
        b.curveTo(15.04f, 14.6f, 13.18f, 16.0f, 11.0f, 16.0f);
        b.curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f);
        b.lineToRelative(1.69f, -1.69f);
        b.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        b.lineTo(4.5f, 12.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.verticalLineToRelative(4.29f);
        b.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        b.lineToRelative(1.2f, -1.2f);
        b.curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f);
        b.curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f);
        b.lineToRelative(4.11f, 4.11f);
        b.curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        b.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -4.1f, -4.12f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findReplace = build;
        build.getClass();
        return build;
    }
}
