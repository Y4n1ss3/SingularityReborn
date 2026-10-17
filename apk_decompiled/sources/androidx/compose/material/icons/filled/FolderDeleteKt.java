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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FolderDeleteKt {
    private static ImageVector _folderDelete;

    public static final ImageVector getFolderDelete(Icons.Filled filled) {
        ImageVector imageVector = _folderDelete;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FolderDelete", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 8.0f, 10.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        h.horizontalLineTo(4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.lineTo(2.01f, 6.0f);
        h.curveTo(2.01f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f);
        kf0.B(h, 6.0f, 2.0f, 2.0f, 8.0f);
        h.curveTo(21.1f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f);
        fc.A(h, 16.5f, 10.0f, 9.0f, -2.0f);
        af0.B(h, 1.0f, 12.0f, 1.5f, 1.0f);
        h.verticalLineToRelative(4.0f);
        h.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        h.horizontalLineToRelative(2.0f);
        h.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        uf.y(h, -4.0f, 1.0f, 10.0f, 16.5f);
        k4.C(h, 16.5f, 15.5f, -2.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(h, 2.0f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderDelete = build;
        build.getClass();
        return build;
    }
}
