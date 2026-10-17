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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoMeetingRoomKt {
    private static ImageVector _noMeetingRoom;

    public static final ImageVector getNoMeetingRoom(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noMeetingRoom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoMeetingRoom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(12.0f, 5.0f, 8.12f, 12.0f, 8.88f);
        k4.D(l, 6.0f, 7.0f, 19.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(l, -4.46f, -5.0f, -5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(12.0f, 5.0f, 3.88f, 2.0f, 2.0f);
        kf0.r(n, 6.0f, 3.0f, 7.88f);
        fc.u(n, 2.0f, 2.0f, 4.0f, -5.0f);
        n.verticalLineTo(3.0f);
        n.horizontalLineTo(6.12f);
        n.lineToRelative(2.0f, 2.0f);
        n.close();
        n.moveTo(2.41f, 2.13f);
        n.lineTo(1.0f, 3.54f);
        uo.x(n, 4.0f, 4.0f, 19.0f, 3.0f);
        kf0.z(n, 2.0f, 11.0f, -4.46f);
        n.lineTo(20.46f, 23.0f);
        gy.B(n, 1.41f, -1.41f, 2.41f, 2.13f);
        uo.p(n, 12.0f, 19.0f, 7.0f, 9.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(n, 5.0f, 5.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeetingRoom = build;
        build.getClass();
        return build;
    }
}
