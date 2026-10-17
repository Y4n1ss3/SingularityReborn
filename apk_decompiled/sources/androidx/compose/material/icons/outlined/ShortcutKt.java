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
import defpackage.er;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShortcutKt {
    private static ImageVector _shortcut;

    public static final ImageVector getShortcut(Icons.Outlined outlined) {
        ImageVector imageVector = _shortcut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Shortcut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.0f, 5.0f, -1.41f, 1.41f);
        e.lineTo(15.0f, 7.83f);
        e.lineTo(17.17f, 10.0f);
        e.horizontalLineTo(8.0f);
        e.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        kf0.z(e, 4.0f, 2.0f, -4.0f);
        e.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        e.horizontalLineToRelative(9.17f);
        e.lineTo(15.0f, 14.17f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineTo(15.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 6.0f, -6.0f, 15.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shortcut = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getShortcut$annotations(Icons.Outlined outlined) {
    }
}
