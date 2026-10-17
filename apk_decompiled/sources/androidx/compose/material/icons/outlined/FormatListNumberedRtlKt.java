package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatListNumberedRtlKt {
    private static ImageVector _formatListNumberedRtl;

    public static final ImageVector getFormatListNumberedRtl(Icons.Outlined outlined) {
        ImageVector imageVector = _formatListNumberedRtl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatListNumberedRtl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(18.0f, 17.0f, 2.0f, 0.5f, -1.0f);
        r6.D(n, 1.0f, 1.0f, 0.5f, -2.0f);
        r6.D(n, 1.0f, 3.0f, -4.0f, -3.0f);
        bv.m(n, 1.0f, 19.0f, 8.0f, 1.0f);
        fc.w(n, 20.0f, 4.0f, -2.0f, 1.0f);
        fc.x(n, 1.0f, 3.0f, 18.0f, 11.0f);
        n.horizontalLineToRelative(1.8f);
        n.lineTo(18.0f, 13.1f);
        n.verticalLineToRelative(0.9f);
        kf0.x(n, 3.0f, -1.0f, -1.8f);
        n.lineToRelative(1.8f, -2.1f);
        r6.m(n, 21.0f, 10.0f, -3.0f, 1.0f);
        k4.C(n, 2.0f, 5.0f, 14.0f, 2.0f);
        r6.C(n, 2.0f, 7.0f, 2.0f, 5.0f);
        k4.C(n, 2.0f, 17.0f, 14.0f, 2.0f);
        bv.r(n, 2.0f, 19.0f, -2.0f);
        k4.C(n, 2.0f, 11.0f, 14.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(n, 2.0f, 13.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListNumberedRtl = build;
        build.getClass();
        return build;
    }
}
