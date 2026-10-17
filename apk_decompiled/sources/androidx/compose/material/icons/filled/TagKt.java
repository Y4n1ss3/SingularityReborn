package androidx.compose.material.icons.filled;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TagKt {
    private static ImageVector _tag;

    public static final ImageVector getTag(Icons.Filled filled) {
        ImageVector imageVector = _tag;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tag", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.0f, 10.0f, 20.0f, 8.0f, -4.0f);
        fc.w(k, 16.0f, 4.0f, -2.0f, 4.0f);
        k.horizontalLineToRelative(-4.0f);
        k.lineTo(10.0f, 4.0f);
        k.lineTo(8.0f, 4.0f);
        bv.q(k, 4.0f, 4.0f, 8.0f, 2.0f);
        bv.C(k, 4.0f, 4.0f, 4.0f, 14.0f);
        r6.D(k, 2.0f, 4.0f, 4.0f, 2.0f);
        r6.D(k, -4.0f, 4.0f, 4.0f, 2.0f);
        r6.D(k, -4.0f, 4.0f, -2.0f, -4.0f);
        kf0.C(k, -4.0f, 4.0f, 14.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(k, -4.0f, -4.0f, 4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tag = build;
        build.getClass();
        return build;
    }
}
