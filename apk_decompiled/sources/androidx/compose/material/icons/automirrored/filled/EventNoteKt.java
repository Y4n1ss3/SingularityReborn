package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventNoteKt {
    private static ImageVector _eventNote;

    public static final ImageVector getEventNote(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _eventNote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.EventNote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(17.0f, 10.0f, 7.0f, 10.0f, 2.0f);
        fc.x(s, 10.0f, -2.0f, 19.0f, 3.0f);
        uo.n(s, -1.0f, 18.0f, 1.0f, -2.0f);
        s.verticalLineToRelative(2.0f);
        s.lineTo(8.0f, 3.0f);
        s.lineTo(8.0f, 1.0f);
        s.lineTo(6.0f, 1.0f);
        s.verticalLineToRelative(2.0f);
        s.lineTo(5.0f, 3.0f);
        s.curveToRelative(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        s.lineTo(3.0f, 19.0f);
        s.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(21.0f, 5.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(s, 19.0f, 19.0f, 5.0f, 19.0f);
        r6.m(s, 5.0f, 8.0f, 14.0f, 11.0f);
        s.moveTo(14.0f, 14.0f);
        af0.m(s, 7.0f, 14.0f, 2.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(s, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventNote = build;
        build.getClass();
        return build;
    }
}
