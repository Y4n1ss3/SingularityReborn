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
import defpackage.bv;
import defpackage.er;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FeedKt {
    private static ImageVector _feed;

    public static final ImageVector getFeed(Icons.Sharp sharp) {
        ImageVector imageVector = _feed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Feed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(16.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        bv.k(i, 8.0f, 16.0f, 3.0f);
        k4.C(i, 7.0f, 7.0f, 5.0f, 2.0f);
        bv.s(i, 7.0f, 7.0f, 17.0f, 17.0f);
        bv.h(i, 7.0f, -2.0f, 10.0f, 17.0f);
        k4.A(i, 17.0f, 13.0f, 7.0f, -2.0f);
        uo.r(i, 10.0f, 13.0f, 15.0f, 9.0f);
        i.verticalLineTo(5.0f);
        i.lineToRelative(4.0f, 4.0f);
        i.horizontalLineTo(15.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _feed = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFeed$annotations(Icons.Sharp sharp) {
    }
}
