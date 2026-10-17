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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoMeetingRoomKt {
    private static ImageVector _noMeetingRoom;

    public static final ImageVector getNoMeetingRoom(Icons.Filled filled) {
        ImageVector imageVector = _noMeetingRoom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoMeetingRoom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 11.0f, -1.0f, 2.0f, 2.0f);
        n.verticalLineToRelative(-1.0f);
        n.lineToRelative(9.73f, 9.73f);
        n.lineTo(20.46f, 23.0f);
        n.lineTo(14.0f, 16.54f);
        n.lineTo(14.0f, 21.0f);
        af0.m(n, 3.0f, 21.0f, -2.0f, 2.0f);
        n.lineTo(5.0f, 7.54f);
        n.lineToRelative(-4.0f, -4.0f);
        gy.B(n, 1.27f, -1.27f, 11.0f, 11.0f);
        n.moveTo(14.0f, 11.49f);
        n.lineTo(5.51f, 3.0f);
        af0.m(n, 14.0f, 3.0f, 1.0f, 5.0f);
        n.verticalLineToRelative(12.49f);
        n.lineToRelative(-2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 17.0f, 6.0f, -3.0f, 5.49f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeetingRoom = build;
        build.getClass();
        return build;
    }
}
