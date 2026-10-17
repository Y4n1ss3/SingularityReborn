package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForwardToInboxKt {
    private static ImageVector _forwardToInbox;

    public static final ImageVector getForwardToInbox(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _forwardToInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.ForwardToInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(22.0f, 4.0f, 2.0f, 16.0f, 11.0f);
        gy.i(i, -2.0f, 4.0f, 8.0f);
        i.lineToRelative(8.0f, 5.0f);
        r6.A(i, 8.0f, -5.0f, 5.0f, 2.0f);
        bv.t(i, 4.0f, 12.0f, 11.0f);
        i.lineTo(4.0f, 6.0f);
        gy.n(i, 16.0f, 12.0f, 11.0f);
        i.moveTo(19.0f, 15.0f);
        i.lineToRelative(4.0f, 4.0f);
        r6.A(i, -4.0f, 4.0f, -3.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(i, -2.0f, 4.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forwardToInbox = build;
        build.getClass();
        return build;
    }
}
