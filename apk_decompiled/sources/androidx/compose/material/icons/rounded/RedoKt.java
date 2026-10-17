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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RedoKt {
    private static ImageVector _redo;

    public static final ImageVector getRedo(Icons.Rounded rounded) {
        ImageVector imageVector = _redo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Redo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.4f, 10.6f);
        b.curveTo(16.55f, 8.99f, 14.15f, 8.0f, 11.5f, 8.0f);
        b.curveToRelative(-4.16f, 0.0f, -7.74f, 2.42f, -9.44f, 5.93f);
        b.curveToRelative(-0.32f, 0.67f, 0.04f, 1.47f, 0.75f, 1.71f);
        b.curveToRelative(0.59f, 0.2f, 1.23f, -0.08f, 1.5f, -0.64f);
        b.curveToRelative(1.3f, -2.66f, 4.03f, -4.5f, 7.19f, -4.5f);
        b.curveToRelative(1.95f, 0.0f, 3.73f, 0.72f, 5.12f, 1.88f);
        b.lineToRelative(-1.91f, 1.91f);
        b.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        b.horizontalLineTo(21.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(9.41f);
        b.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -1.89f, 1.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _redo = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getRedo$annotations(Icons.Rounded rounded) {
    }
}
