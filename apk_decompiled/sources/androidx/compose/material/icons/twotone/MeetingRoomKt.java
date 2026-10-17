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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MeetingRoomKt {
    private static ImageVector _meetingRoom;

    public static final ImageVector getMeetingRoom(Icons.TwoTone twoTone) {
        ImageVector imageVector = _meetingRoom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MeetingRoom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(7.0f, 19.0f, 6.0f, 13.0f, 5.0f);
        bv.r(p, 7.0f, 5.0f, 14.0f);
        k4.C(p, 10.0f, 11.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(p, -2.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(19.0f, 19.0f, 19.0f, 4.0f, -4.0f);
        k.lineTo(15.0f, 3.0f);
        k.lineTo(5.0f, 3.0f);
        bv.q(k, 16.0f, 3.0f, 19.0f, 2.0f);
        uo.n(k, 12.0f, 15.0f, 6.0f, 2.0f);
        af0.C(k, 15.0f, 4.0f, -2.0f, -2.0f);
        k.moveTo(13.0f, 19.0f);
        k.lineTo(7.0f, 19.0f);
        r6.m(k, 7.0f, 5.0f, 6.0f, 14.0f);
        k4.C(k, 10.0f, 11.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(k, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _meetingRoom = build;
        build.getClass();
        return build;
    }
}
