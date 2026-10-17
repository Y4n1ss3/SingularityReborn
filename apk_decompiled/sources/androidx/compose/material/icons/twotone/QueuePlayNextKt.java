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
import defpackage.fc;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QueuePlayNextKt {
    private static ImageVector _queuePlayNext;

    public static final ImageVector getQueuePlayNext(Icons.TwoTone twoTone) {
        ImageVector imageVector = _queuePlayNext;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.QueuePlayNext", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(13.0f, 15.0f, -3.0f, 3.0f, -2.0f);
        uo.n(s, -3.0f, 13.0f, 7.0f, -2.0f);
        bv.q(s, 3.0f, 8.0f, 10.0f, 2.0f);
        fc.x(s, 3.0f, 3.0f, 18.0f, 15.0f);
        s.lineToRelative(3.0f, 3.0f);
        s.lineToRelative(-3.0f, 3.0f);
        s.lineToRelative(1.5f, 1.5f);
        bv.o(s, 24.0f, 18.0f, -4.5f, -4.5f);
        bv.y(s, 8.0f, 19.0f, 2.0f, 8.0f);
        kf0.z(s, -2.0f, 2.0f, -2.0f);
        s.lineTo(3.0f, 17.0f);
        fc.w(s, 3.0f, 5.0f, 18.0f, 8.0f);
        s.horizontalLineToRelative(2.0f);
        s.lineTo(23.0f, 5.0f);
        s.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.lineTo(3.0f, 3.0f);
        s.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        s.verticalLineToRelative(12.0f);
        s.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(s, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queuePlayNext = build;
        build.getClass();
        return build;
    }
}
