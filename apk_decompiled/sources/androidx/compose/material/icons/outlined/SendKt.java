package androidx.compose.material.icons.outlined;

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
import defpackage.er;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendKt {
    private static ImageVector _send;

    public static final ImageVector getSend(Icons.Outlined outlined) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Send", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.01f, 6.03f, 7.51f, 3.22f);
        e.lineToRelative(-7.52f, -1.0f);
        e.lineToRelative(0.01f, -2.22f);
        e.moveToRelative(7.5f, 8.72f);
        e.lineTo(4.0f, 17.97f);
        e.verticalLineToRelative(-2.22f);
        e.lineToRelative(7.51f, -1.0f);
        e.moveTo(2.01f, 3.0f);
        e.lineTo(2.0f, 10.0f);
        e.lineToRelative(15.0f, 2.0f);
        e.lineToRelative(-15.0f, 2.0f);
        e.lineToRelative(0.01f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 23.0f, 12.0f, 2.01f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getSend$annotations(Icons.Outlined outlined) {
    }
}
