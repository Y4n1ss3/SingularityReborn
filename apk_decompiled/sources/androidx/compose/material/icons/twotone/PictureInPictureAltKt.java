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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PictureInPictureAltKt {
    private static ImageVector _pictureInPictureAlt;

    public static final ImageVector getPictureInPictureAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pictureInPictureAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PictureInPictureAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(19.0f, 11.0f, -8.0f, 6.0f, 8.0f);
        bv.m(n, -6.0f, 17.0f, 15.0f, -4.0f);
        r6.p(n, -2.0f, 4.0f, 2.0f);
        n.moveTo(21.0f, 3.0f);
        n.lineTo(3.0f, 3.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.88f, -2.0f, 1.98f);
        n.lineTo(1.0f, 19.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(18.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.lineTo(23.0f, 4.98f);
        n.curveTo(23.0f, 3.88f, 22.1f, 3.0f, 21.0f, 3.0f);
        k4.r(n, 21.0f, 19.02f, 3.0f, 19.02f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 3.0f, 4.97f, 18.0f, 14.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(13.0f, 13.0f, 4.0f, 2.0f, -4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pictureInPictureAlt = build;
        build.getClass();
        return build;
    }
}
