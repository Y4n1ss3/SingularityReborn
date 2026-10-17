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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventKt {
    private static ImageVector _event;

    public static final ImageVector getEvent(Icons.Sharp sharp) {
        ImageVector imageVector = _event;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Event", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(17.0f, 13.0f, -5.0f, 5.0f, 5.0f);
        kp0.z(n, -5.0f, 16.0f, 2.0f, 2.0f);
        n.lineTo(8.0f, 4.0f);
        n.lineTo(8.0f, 2.0f);
        n.lineTo(6.0f, 2.0f);
        n.verticalLineToRelative(2.0f);
        n.lineTo(3.01f, 4.0f);
        n.lineTo(3.0f, 22.0f);
        uo.n(n, 18.0f, 21.0f, 4.0f, -3.0f);
        uf.j(n, 18.0f, 2.0f, -2.0f);
        n.moveTo(19.0f, 20.0f);
        n.lineTo(5.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 5.0f, 9.0f, 14.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _event = build;
        build.getClass();
        return build;
    }
}
