package defpackage;

import java.io.BufferedReader;
import java.io.DataOutputStream;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vj0 {
    public final Process a;
    public final DataOutputStream b;
    public final BufferedReader c;

    public vj0(Process process, DataOutputStream dataOutputStream, BufferedReader bufferedReader) {
        this.a = process;
        this.b = dataOutputStream;
        this.c = bufferedReader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj;
        return this.a.equals(vj0Var.a) && this.b.equals(vj0Var.b) && this.c.equals(vj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShellState(process=" + this.a + ", writer=" + this.b + ", reader=" + this.c + ")";
    }
}
