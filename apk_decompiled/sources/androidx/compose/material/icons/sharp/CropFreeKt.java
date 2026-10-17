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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CropFreeKt {
    private static ImageVector _cropFree;

    public static final ImageVector getCropFree(Icons.Sharp sharp) {
        ImageVector imageVector = _cropFree;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CropFree", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(3.0f, 3.0f, 6.0f, 2.0f);
        m.lineTo(5.0f, 5.0f);
        m.horizontalLineToRelative(4.0f);
        r6.C(m, 9.0f, 3.0f, 3.0f, 3.0f);
        m.moveTo(5.0f, 15.0f);
        af0.m(m, 3.0f, 15.0f, 6.0f, 6.0f);
        bv.n(m, -2.0f, 5.0f, 19.0f, -4.0f);
        k4.C(m, 19.0f, 19.0f, -4.0f, 2.0f);
        gy.D(m, 6.0f, -6.0f, -2.0f, 4.0f);
        k4.C(m, 21.0f, 3.0f, -6.0f, 2.0f);
        kf0.x(m, 4.0f, 4.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(m, 21.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cropFree = build;
        build.getClass();
        return build;
    }
}
