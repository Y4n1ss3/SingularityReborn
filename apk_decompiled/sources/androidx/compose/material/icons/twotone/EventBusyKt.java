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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventBusyKt {
    private static ImageVector _eventBusy;

    public static final ImageVector getEventBusy(Icons.TwoTone twoTone) {
        ImageVector imageVector = _eventBusy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EventBusy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.f(5.0f, 5.0f, 14.0f, 2.0f, 5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(19.0f, 3.0f, -1.0f, 18.0f, 1.0f);
        bv.C(p, -2.0f, 2.0f, 8.0f, 3.0f);
        p.lineTo(8.0f, 1.0f);
        p.lineTo(6.0f, 1.0f);
        p.verticalLineToRelative(2.0f);
        p.lineTo(5.0f, 3.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(14.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(14.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(21.0f, 5.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(p, 19.0f, 19.0f, 5.0f, 19.0f);
        r6.m(p, 5.0f, 9.0f, 14.0f, 10.0f);
        p.moveTo(19.0f, 7.0f);
        p.lineTo(5.0f, 7.0f);
        r6.m(p, 5.0f, 5.0f, 14.0f, 2.0f);
        p.moveTo(9.29f, 17.47f);
        p.lineToRelative(2.44f, -2.44f);
        p.lineToRelative(2.44f, 2.44f);
        p.lineToRelative(1.06f, -1.06f);
        p.lineToRelative(-2.44f, -2.44f);
        p.lineToRelative(2.44f, -2.44f);
        p.lineToRelative(-1.06f, -1.06f);
        p.lineToRelative(-2.44f, 2.44f);
        p.lineToRelative(-2.44f, -2.44f);
        p.lineToRelative(-1.06f, 1.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, 2.44f, 2.44f, -2.44f, 2.44f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventBusy = build;
        build.getClass();
        return build;
    }
}
