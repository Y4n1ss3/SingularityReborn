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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RsvpKt {
    private static ImageVector _rsvp;

    public static final ImageVector getRsvp(Icons.Filled filled) {
        ImageVector imageVector = _rsvp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rsvp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(16.0f, 9.0f, 1.5f, -1.75f, 6.0f);
        kf0.A(i, -1.5f, 12.5f, 9.0f, 14.0f);
        gy.B(i, 1.0f, 3.43f, 16.0f, 9.0f);
        i.moveTo(5.1f, 12.9f);
        i.lineTo(6.0f, 15.0f);
        fc.z(i, 4.5f, -0.85f, -2.0f, 2.5f);
        kf0.w(i, 2.0f, 1.0f, 9.0f, 3.5f);
        i.curveTo(5.35f, 9.0f, 6.0f, 9.65f, 6.0f, 10.5f);
        i.verticalLineToRelative(1.0f);
        i.curveTo(6.0f, 12.1f, 5.6f, 12.65f, 5.1f, 12.9f);
        r6.B(i, 4.5f, 10.5f, -2.0f, 1.0f);
        uo.r(i, 2.0f, 10.5f, 21.5f, 13.0f);
        gy.o(i, -2.0f, 2.0f, 18.0f, 9.0f);
        i.horizontalLineToRelative(3.5f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        i.verticalLineToRelative(1.0f);
        i.curveTo(23.0f, 12.33f, 22.33f, 13.0f, 21.5f, 13.0f);
        r6.B(i, 21.5f, 10.5f, -2.0f, 1.0f);
        uo.r(i, 2.0f, 10.5f, 11.5f, 9.0f);
        r6.D(i, 1.5f, -3.0f, 0.75f, 2.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineTo(14.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        uf.k(i, 7.0f, -1.5f, 3.0f, -0.75f);
        i.horizontalLineTo(7.75f);
        i.curveTo(7.34f, 12.75f, 7.0f, 12.41f, 7.0f, 12.0f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rsvp = build;
        build.getClass();
        return build;
    }
}
