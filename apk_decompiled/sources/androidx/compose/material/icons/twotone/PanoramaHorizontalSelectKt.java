package androidx.compose.material.icons.twotone;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaHorizontalSelectKt {
    private static ImageVector _panoramaHorizontalSelect;

    public static final ImageVector getPanoramaHorizontalSelect(Icons.TwoTone twoTone) {
        ImageVector imageVector = _panoramaHorizontalSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanoramaHorizontalSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(4.0f, 6.38f, 11.25f);
        h.curveToRelative(2.01f, -0.59f, 4.61f, -1.13f, 8.0f, -1.13f);
        h.curveToRelative(3.38f, 0.0f, 5.99f, 0.54f, 8.0f, 1.13f);
        h.verticalLineTo(6.37f);
        h.curveToRelative(-2.01f, 0.59f, -4.62f, 1.13f, -8.0f, 1.13f);
        h.curveTo(9.32f, 7.5f, 6.58f, 7.11f, 4.0f, 6.38f);
        h.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.01f, 4.0f);
        b.curveTo(20.45f, 4.0f, 17.4f, 5.5f, 12.0f, 5.5f);
        b.curveToRelative(-5.31f, 0.0f, -8.49f, -1.49f, -9.01f, -1.49f);
        b.curveTo(2.46f, 4.01f, 2.0f, 4.45f, 2.0f, 5.02f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 0.57f, 0.46f, 1.0f, 0.99f, 1.0f);
        b.curveToRelative(0.57f, 0.0f, 3.55f, -1.5f, 9.01f, -1.5f);
        b.curveToRelative(5.42f, 0.0f, 8.44f, 1.5f, 9.01f, 1.5f);
        b.curveToRelative(0.53f, 0.0f, 0.99f, -0.43f, 0.99f, -1.0f);
        b.verticalLineTo(5.0f);
        b.curveTo(22.0f, 4.43f, 21.54f, 4.0f, 21.01f, 4.0f);
        b.close();
        b.moveTo(20.0f, 17.63f);
        b.curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8.0f, -1.13f);
        b.curveToRelative(-3.39f, 0.0f, -5.99f, 0.54f, -8.0f, 1.13f);
        b.verticalLineTo(6.38f);
        b.curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12.0f, 7.5f);
        b.curveToRelative(3.38f, 0.0f, 5.99f, -0.54f, 8.0f, -1.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 17.63f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontalSelect = build;
        build.getClass();
        return build;
    }
}
