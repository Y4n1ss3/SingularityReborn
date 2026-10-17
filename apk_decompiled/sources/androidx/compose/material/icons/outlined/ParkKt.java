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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ParkKt {
    private static ImageVector _park;

    public static final ImageVector getPark(Icons.Outlined outlined) {
        ImageVector imageVector = _park;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Park", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(17.0f, 12.0f, 2.0f, 12.0f, 2.0f);
        p.lineTo(5.05f, 12.0f);
        uo.g(p, 7.0f, -3.9f, 6.0f, 6.92f);
        uf.s(p, 4.0f, 3.95f, -4.0f, 21.0f);
        uo.l(p, 17.0f, 12.0f, 6.79f, 16.0f);
        p.lineToRelative(3.9f, -6.0f);
        p.horizontalLineTo(8.88f);
        p.lineToRelative(3.13f, -4.5f);
        p.lineToRelative(3.15f, 4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(p, -1.9f, 4.0f, 6.0f, 6.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _park = build;
        build.getClass();
        return build;
    }
}
