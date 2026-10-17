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
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventNoteKt {
    private static ImageVector _eventNote;

    public static final ImageVector getEventNote(Icons.Sharp sharp) {
        ImageVector imageVector = _eventNote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EventNote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(17.0f, 10.0f, 7.0f, 10.0f, 2.0f);
        fc.x(s, 10.0f, -2.0f, 21.0f, 3.0f);
        uo.n(s, -3.0f, 18.0f, 1.0f, -2.0f);
        s.verticalLineToRelative(2.0f);
        s.lineTo(8.0f, 3.0f);
        s.lineTo(8.0f, 1.0f);
        s.lineTo(6.0f, 1.0f);
        bv.q(s, 2.0f, 3.0f, 3.0f, 18.0f);
        gy.n(s, 18.0f, 21.0f, 3.0f);
        s.moveTo(19.0f, 19.0f);
        s.lineTo(5.0f, 19.0f);
        r6.m(s, 5.0f, 8.0f, 14.0f, 11.0f);
        s.moveTo(14.0f, 14.0f);
        af0.m(s, 7.0f, 14.0f, 2.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(s, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventNote = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getEventNote$annotations(Icons.Sharp sharp) {
    }
}
