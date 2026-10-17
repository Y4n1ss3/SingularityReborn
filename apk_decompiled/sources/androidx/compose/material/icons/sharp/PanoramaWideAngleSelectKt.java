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
public final class PanoramaWideAngleSelectKt {
    private static ImageVector _panoramaWideAngleSelect;

    public static final ImageVector getPanoramaWideAngleSelect(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaWideAngleSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaWideAngleSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveTo(8.03f, 4.0f, 5.15f, 4.63f, 3.0f, 5.0f);
        b.curveToRelative(-0.55f, 1.97f, -1.0f, 3.92f, -1.0f, 7.0f);
        b.curveToRelative(0.0f, 3.03f, 0.45f, 5.05f, 1.0f, 7.0f);
        b.curveToRelative(2.15f, 0.37f, 4.98f, 1.0f, 9.0f, 1.0f);
        b.curveToRelative(3.97f, 0.0f, 6.85f, -0.63f, 9.0f, -1.0f);
        b.curveToRelative(0.57f, -2.02f, 1.0f, -3.99f, 1.0f, -7.0f);
        b.curveToRelative(0.0f, -3.03f, -0.45f, -5.05f, -1.0f, -7.0f);
        b.curveTo(18.85f, 4.63f, 16.02f, 4.0f, 12.0f, 4.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaWideAngleSelect = build;
        build.getClass();
        return build;
    }
}
