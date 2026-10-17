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
public final class HistoryKt {
    private static ImageVector _history;

    public static final ImageVector getHistory(Icons.Rounded rounded) {
        ImageVector imageVector = _history;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.History", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.26f, 3.0f);
        b.curveTo(8.17f, 2.86f, 4.0f, 6.95f, 4.0f, 12.0f);
        b.lineTo(2.21f, 12.0f);
        b.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        b.lineToRelative(2.79f, 2.8f);
        b.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        b.lineToRelative(2.79f, -2.8f);
        b.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        b.lineTo(6.0f, 12.0f);
        b.curveToRelative(0.0f, -3.9f, 3.18f, -7.05f, 7.1f, -7.0f);
        b.curveToRelative(3.72f, 0.05f, 6.85f, 3.18f, 6.9f, 6.9f);
        b.curveToRelative(0.05f, 3.91f, -3.1f, 7.1f, -7.0f, 7.1f);
        b.curveToRelative(-1.61f, 0.0f, -3.1f, -0.55f, -4.28f, -1.48f);
        b.curveToRelative(-0.4f, -0.31f, -0.96f, -0.28f, -1.32f, 0.08f);
        b.curveToRelative(-0.42f, 0.42f, -0.39f, 1.13f, 0.08f, 1.49f);
        b.curveTo(9.0f, 20.29f, 10.91f, 21.0f, 13.0f, 21.0f);
        b.curveToRelative(5.05f, 0.0f, 9.14f, -4.17f, 9.0f, -9.26f);
        b.curveToRelative(-0.13f, -4.69f, -4.05f, -8.61f, -8.74f, -8.74f);
        b.close();
        b.moveTo(12.75f, 8.0f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.verticalLineToRelative(3.68f);
        b.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        b.lineToRelative(3.12f, 1.85f);
        b.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        b.curveToRelative(0.21f, -0.36f, 0.09f, -0.82f, -0.26f, -1.03f);
        b.lineToRelative(-2.88f, -1.71f);
        b.verticalLineToRelative(-3.4f);
        b.curveToRelative(0.0f, -0.4f, -0.34f, -0.74f, -0.75f, -0.74f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _history = build;
        build.getClass();
        return build;
    }
}
