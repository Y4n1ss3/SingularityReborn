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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QueuePlayNextKt {
    private static ImageVector _queuePlayNext;

    public static final ImageVector getQueuePlayNext(Icons.Sharp sharp) {
        ImageVector imageVector = _queuePlayNext;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.QueuePlayNext", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(23.0f, 3.0f, 1.0f, 3.0f, 16.0f);
        af0.v(s, 7.0f, 2.0f, 8.0f, -2.0f);
        bv.C(s, 2.0f, -2.0f, 3.0f, 17.0f);
        fc.w(s, 3.0f, 5.0f, 18.0f, 8.0f);
        gy.n(s, 2.0f, 23.0f, 3.0f);
        s.moveTo(13.0f, 10.0f);
        fc.w(s, 13.0f, 7.0f, -2.0f, 3.0f);
        af0.m(s, 8.0f, 10.0f, 2.0f, 3.0f);
        r6.D(s, 3.0f, 2.0f, -3.0f, 3.0f);
        kf0.C(s, -2.0f, -3.0f, 24.0f, 18.0f);
        s.lineToRelative(-4.5f, 4.5f);
        s.lineTo(18.0f, 21.0f);
        s.lineToRelative(3.0f, -3.0f);
        s.lineToRelative(-3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, 1.5f, -1.5f, 24.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queuePlayNext = build;
        build.getClass();
        return build;
    }
}
