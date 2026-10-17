package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class b11 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        name.getClass();
        if (ks0.c0(name, "singularity-update", false)) {
            String name2 = file.getName();
            name2.getClass();
            if (ks0.Z(name2, ".apk", false)) {
                return true;
            }
        }
        return false;
    }
}
