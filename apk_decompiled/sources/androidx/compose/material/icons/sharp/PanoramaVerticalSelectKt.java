package androidx.compose.material.icons.sharp;

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
public final class PanoramaVerticalSelectKt {
    private static ImageVector _panoramaVerticalSelect;

    public static final ImageVector getPanoramaVerticalSelect(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaVerticalSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaVerticalSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.49f, 11.99f);
        b.curveToRelative(0.0f, -5.25f, 1.54f, -9.01f, 1.92f, -10.0f);
        b.lineToRelative(-16.82f, 0.0f);
        b.curveToRelative(0.76f, 2.16f, 1.9f, 5.21f, 1.9f, 10.0f);
        b.curveToRelative(0.0f, 4.78f, -1.17f, 7.91f, -1.9f, 10.0f);
        b.lineToRelative(16.81f, 0.0f);
        b.curveTo(19.66f, 19.91f, 18.49f, 16.76f, 18.49f, 11.99f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVerticalSelect = build;
        build.getClass();
        return build;
    }
}
