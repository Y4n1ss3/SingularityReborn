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
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompressKt {
    private static ImageVector _compress;

    public static final ImageVector getCompress(Icons.Outlined outlined) {
        ImageVector imageVector = _compress;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Compress", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(4.0f, 9.0f, 2.0f, 16.0f, 9.0f);
        k4.w(w, 4.0f, 16.0f, 4.0f);
        w.lineToRelative(-1.41f, -1.41f);
        fc.t(w, 13.0f, 4.17f, 1.0f, -2.0f);
        w.verticalLineToRelative(3.19f);
        w.lineTo(9.39f, 2.61f);
        w.lineTo(8.0f, 4.0f);
        gy.B(w, 4.0f, 4.0f, 16.0f, 4.0f);
        k4.C(w, 4.0f, 14.0f, 16.0f, -2.0f);
        bv.s(w, 4.0f, 14.0f, 8.0f, 19.0f);
        w.lineToRelative(1.39f, 1.39f);
        fc.t(w, 11.0f, 18.81f, 22.0f, 2.0f);
        w.verticalLineToRelative(-3.17f);
        w.lineToRelative(1.59f, 1.59f);
        w.lineTo(16.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(w, -4.0f, -4.0f, 8.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compress = build;
        build.getClass();
        return build;
    }
}
